package cn.maven.test.registry.serviceImpl;

import org.springframework.stereotype.Service;

import cn.maven.test.registry.service.ITestRegistryService;

@Service("testRegistryService")
public class TestRegistryServiceImpl implements ITestRegistryService{

	@Override
	public String hello(String name) {
		return "hello"+name;
	}

}
