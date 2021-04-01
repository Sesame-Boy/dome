package com.cloud.spring.filter;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
/**
 * 网关统一的token验证
 *
 * @author pangu
 * @since 1.5.8
 */
@Slf4j
@Component
@AllArgsConstructor
public class PreUaaFilter implements GlobalFilter, Ordered {

	/**
	 * 路径前缀以/mate开头，如mate-system
	 */
	public static final String PATH_PREFIX = "/mate";

	/**
	 * 索引自1开头检索，跳过第一个字符就是检索的字符的问题
	 */
	public static final int FROM_INDEX = 1;

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		String path = exchange.getRequest().getPath().toString();
		log.info("进入了全局过滤器,path:[{}]", path);

		// 修改 request
		ServerHttpRequest request = exchange.getRequest().mutate().header("x-token", "123456").build();

		return chain.filter(exchange.mutate().request(request).build());
//		return chain.filter(exchange);
	}

	public static void main(String[] args) {

	}

	@Override
	public int getOrder() {
		return 0;
	}
}
