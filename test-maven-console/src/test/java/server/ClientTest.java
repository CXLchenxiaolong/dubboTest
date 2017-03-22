package server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.maven.test.registry.service.ITestRegistryService;


public class ClientTest {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring/dubbo-consumer.xml");
		context.start();

		ITestRegistryService demoService = (ITestRegistryService) context
				.getBean("testRegistryService"); // 获取远程服务代理
		// 8905038725121
		System.out.println(demoService.hello("xiaolonglong de dubbo"));
	}
}
