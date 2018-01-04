package com.fly.demo;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

public class Demo {
	
	public static void main(String[] args) throws SolrServerException, IOException {
		// 1. 创建HttpSolrServer对象
		// 设置solr服务接口,浏览器客户端地址http://127.0.0.1:8081/solr/
		// 如果想上面不指定某个Solr实例默认使用第一个，但最好还是指定一个
		String baseURL = "http://127.0.0.1:8081/solr/collection1";
		HttpSolrServer httpSolrServer = new HttpSolrServer(baseURL);

		// 2. 创建SolrInputDocument对象
		SolrInputDocument document = new SolrInputDocument();
		document.addField("id", "c1001");
		document.addField("content", "Hello world!");

		// 3. 把SolrInputDocument对象添加到索引库中
		httpSolrServer.add(document);

		// 4. 提交
		httpSolrServer.commit();
		
		System.out.println("finished");

	}
	
	@Test
	public void testDynamicField() throws SolrServerException, IOException {
		// 1. 创建HttpSolrServer对象
				// 设置solr服务接口,浏览器客户端地址http://127.0.0.1:8081/solr/
				// 如果想上面不指定某个Solr实例默认使用第一个，但最好还是指定一个
				String baseURL = "http://127.0.0.1:8081/solr/collection1";
				HttpSolrServer httpSolrServer = new HttpSolrServer(baseURL);

				// 2. 创建SolrInputDocument对象
				SolrInputDocument document = new SolrInputDocument();
				document.addField("id", "c1001");
				document.addField("content", "I'm Jay Chou");

				// 3. 把SolrInputDocument对象添加到索引库中
				httpSolrServer.add(document);

				// 4. 提交
				httpSolrServer.commit();
				
				System.out.println("hello");
				System.out.println("finished");
	}

}
