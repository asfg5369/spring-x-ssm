/*
package cn.xmall.es;

import com.alibaba.fastjson.JSONObject;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.get.MultiGetItemResponse;
import org.elasticsearch.action.get.MultiGetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;


*/
/**
 * author:姜亮;Date:2018/7/17
 *//*

//@RunWith(SpringJUnit4ClassRunner.class)
public class ES {
	private TransportClient client;
	private IndexRequest source;

	@Test
	public void test1() throws Exception {
		System.out.println("createJson4:" + (createJson4()));
	}

	*/
/**
	 * 获取连接, 第一种方式
	 *//*

	@Before
	public void before1()  {
		try {
			client = new PreBuiltTransportClient(Settings.EMPTY)
					.addTransportAddress(new TransportAddress(InetAddress.getByName("192.168.3.226"), 9300)
					);
			System.out.println("success connect to es!");
		} catch (UnknownHostException e) {
			e.printStackTrace();
			System.out.println("fail connect to es");
		}

	}

	*/
/**
	 * 使用map创建json
	 *//*

	@Test
	public void createJson2() {
		Map<String, Object> json = new HashMap<String, Object>();
		json.put("user", "kimchy");
		json.put("postDate", new Date());
		json.put("message", "trying out elasticsearch");
		System.out.println("json:" + json);
		//return json;
	}

	*/
/**
	 * 使用fastjson创建
	 *//*

	public JSONObject createJson3() {
		JSONObject json = new JSONObject();
		json.put("user", "kimchy");
		json.put("postDate", new Date());
		json.put("message", "trying out elasticsearch");
		return json;
	}

	*/
/**
	 * 使用es的帮助类
	 *//*

	public XContentBuilder createJson4() throws IOException {
		XContentBuilder source = XContentFactory.jsonBuilder();
		source.startObject().field("name", "kimchy").field("age", "22")
				.field("birth", "1991-11-20").endObject();
		return source;
	}

	*/
/**
	 * 存入索引中
	 *
	 * @throws Exception
	 *//*

	@Test
	public void put() throws Exception {
		XContentBuilder source = createJson4();
		IndexResponse response = client.prepareIndex("testindex", "article", "oxQpp2QBTrkUQkYpL22").setSource(source).get();
		System.out.println("response:" + response);
		// 结果获取
		String index = response.getIndex();
		String type = response.getType();
		String id = response.getId();
		long version = response.getVersion();
		System.out.println("index:" + index + ",type:" + type + ",id:" + id + ",version:" + version);
	}

	@Test
	public void get() throws UnknownHostException {
		GetResponse response = client.prepareGet("testindex", "article", "oxQpp2QBTrkUQkYpL-w1")
				// 线程安全
				.get();
		System.out.println(response.getSourceAsString());
	}

	@Test
	public void delete() {
		DeleteResponse response = client.prepareDelete("testindex", "article", "oxQpp2QBTrkUQkYpL22").get();
		System.out.println("response:" + response.getId());
	}

	@Test
	public void updateRequest() throws IOException, ExecutionException, InterruptedException {
		*/
/*UpdateRequest update=new UpdateRequest();
		update.index("testindex");
		update.type("article");
		update.id("pBQsp2QBTrkUQkYp0Owf");
		update.doc(XContentFactory.jsonBuilder().startObject().field("name","jl").endObject());
		UpdateResponse response = client.update(update).get();*//*

		UpdateResponse response = client.update(new UpdateRequest("testindex", "article", "pBQsp2QBTrkUQkYp0Owf")
				.doc(XContentFactory.jsonBuilder()
						.startObject()
						.field("name", "jl1")
						.endObject()
				)).get();
		System.out.println("id:" + response.getId());
	}

	@Test
	public void testMultiGet() {
		MultiGetResponse multiGetResponses = client.prepareMultiGet()
				.add("testindex", "article", "pBQsp2QBTrkUQkYp0Owf", "pRQtp2QBTrkUQkYpV-xf")
				.get();

		for (MultiGetItemResponse itemResponse : multiGetResponses) {
			GetResponse response = itemResponse.getResponse();
			if (response.isExists()) {
				String sourceAsString = response.getSourceAsString();
				System.out.println(sourceAsString);
			}
		}
	}
}
*/
