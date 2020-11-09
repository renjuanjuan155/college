package com.springboot.college;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.digest.HMac;
import com.springboot.college.util.thread.MyThread;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootTest
public class CollegeApplicationTests {
	/*@Test
	public void getFrsDataTest(){
		System.out.println("******************");
		String sql="select * from erp.jsh_user";
		List<JSONObject> result= ClickHouseUtil.exeSql(sql);
		System.out.println("******************");
	}*/

	@Test
	public void contextLoads() {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		Calendar cal = Calendar.getInstance();
		long queryId = Long.parseLong(format.format(cal.getTime()));
		System.out.println("time:"+queryId);
	}

	/**
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,s=0;
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入总共有几辆车，几个路口");
		m = sc.nextInt();
		n = sc.nextInt();
		int user[][] = new int[0][n];
		System.out.println("请输入车辆卸货时间");
		for(int i=0;i<m;i++){
			int arr[][]=new int[user.length+1][n];
			for(int j=0;j<user.length;j++){
				arr[j]=user[j];
			}
			for(int q=0;q<arr[0].length;q++){
				arr[arr.length-1][q]=sc.nextInt();
			}
			user=arr;
		}
		for(int i = 0;i < user.length;i++){
			System.out.println(Arrays.toString(user[i]));
		}
		for(int i=1;i<n;i++){
			user[i][0]=user[i][0]+user[i-1][0];
			user[0][i]=user[0][i]+user[0][i-1];
			for(int j=1;j<n;j++)
				if(user[i][j-1]>=user[i-1][j]){
					user[i][j]=user[i][j]+user[i][j-1];
				}else{
					user[i][j]=user[i][j]+user[i-1][j];
				}
		}
		for(int i = 0;i < user.length;i++){
			System.out.println(Arrays.toString(user[i]));
		}
		for(int i = user.length;i <=user.length;i++){
			a=user[user.length-1][user.length-1];
			System.out.println(a);
		}
	}
	 */
	/**
	public static void main(String[] args) {
		String text = "1234567890";
		String result;
		String format = "jpg";
		//生成二维码
		File outputFile = new File("https://www.baidu.com/");
		try {
			MatrixUtil.writeToFile(MatrixUtil.toQRCodeMatrix(text, null, null), format, outputFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("success1");
		//result = MatrixUtil.decode(outputFile);
		//System.out.println(result);
		//生成条形码
		outputFile = new File("https://www.baidu.com/");
		try {
			MatrixUtil.writeToFile(MatrixUtil.toBarCodeMatrix(text, null, null), format, outputFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("success2");
		//result = MatrixUtil.decode(outputFile);
		//System.out.println(result);
	}*/
	/**
	public static void main(String[] args){
		//ImageIcon image= new ImageIcon(ClassLoader.getSystemResource("img/112.png"));
		String srcImgPath = "D:/personal/picture/3.jpg";
		String logoText = "复 印 无 效";
		String iconPath = "d:/pic/112.png";

		String targerTextPath = "D:/personal/picture/4.jpg";
		String targerTextPath2 = "d:/qie_text_rotate.jpg";

		String targerIconPath = "d:/qie_icon.jpg";
		String targerIconPath2 = "d:/qie_icon_rotate.jpg";

		System.out.println("给图片添加水印文字开始...");
		// 给图片添加水印文字
		ImageRemarkUtil.markImageByText(logoText, srcImgPath, targerTextPath);
		// 给图片添加水印文字,水印文字旋转-45
		ImageRemarkUtil.markImageByText(logoText, srcImgPath, targerTextPath2, -45);
		System.out.println("给图片添加水印文字结束...");

		System.out.println("给图片添加水印图片开始...");
		ImageRemarkUtil.setImageMarkOptions(0.3f, 1, 1, null, null);
		// 给图片添加水印图片
		//markImageByIcon(iconPath, srcImgPath, targerIconPath,response);
		// 给图片添加水印图片,水印图片旋转-45
		//markImageByIcon(iconPath, srcImgPath, targerIconPath2, -45);
		System.out.println("给图片添加水印图片结束...");
	}*/


	/*public static void main(String[] args){
		//将Json文本数据信息转换为JsonObject对象,通过K V的形式获取值
		String str = "{\"name\":\"乱敲代码\"}";
		JSONObject jsonObject = JSON.parseObject(str );
		System.out.println(jsonObject);//{"name":"乱敲代码"}

		//将json文本信息转换为实体类
		String s = "{\"id\":\"0375\",\"city\":\"上海\"}";
		CityReq cityReq = JSON.parseObject(s, CityReq.class);
		System.out.println(cityReq.toString());//CityReq(id=0375, city=上海)
		System.out.println(cityReq.getId());// 0375

		//将List转换成JSON格式数据
		List<String> stringList = new ArrayList<>();
		stringList.add("test");
		stringList.add("123");
		System.out.println(stringList);//[test, 123]
		String s1 = JSON.toJSONString(stringList);
		System.out.println(s1);//["test","123"]

		//将map转换成JSON格式数据
		Map<String,String> stringMap = new HashMap<>();
		stringMap.put("name","test");
		stringMap.put("pass","123");
		System.out.println(stringMap);//{pass=123, name=test}
		String s2 = JSON.toJSONString(stringMap);
		System.out.println(s2);//{"pass":"123","name":"test"}

		//将JSON数据转成JSONArray格式数据
		String json = "[{\"id\":\"0375\",\"city\":\"平顶山\"},{\"id\":\"0377\",\"city\":\"南阳\"}]";
		//将json文本格式转为JSONArray
		JSONArray objects = JSON.parseArray(json);
		System.out.println(objects);
		String s3 = objects.get(1)+"";
		System.out.println("s3="+s3);//s3={"city":"南阳","id":"0377"}
		System.out.println(objects.get(0));//{"city":"平顶山","id":"0375"}
		JSONObject jsonObject1 = JSON.parseObject(s3);
		System.out.println(jsonObject1.get("id"));//0377
		System.out.println(objects.get(0));//{"city":"平顶山","id":"0375"}
	}*/

	SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
	Calendar cal = Calendar.getInstance();
	long queryId = Long.parseLong(format.format(cal.getTime()));

	@Test
	public  void time(){
		String[] list= {"2020-04-01-2020-04-02","2020-04-03-2020-04-04"};
		//循环遍历数组
		for(int a=0;a<list.length-1;a++) {
			String item = list[a];//接收17:31-18:00
			String items = list[a+1];//接收18:01-18:30
			item=(String) item.subSequence(0, 10);//截取item中17:31
			items=(String) items.subSequence(0, 10);//截取item中18:01
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
			Date c= null;
			try {
				c = sdf.parse(item);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			Date d= null;
			try {
				d = sdf.parse(items);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			if(d.getTime()-c.getTime()!=1800000) {
				System.out.println("不连续时间段为："+item+"="+items);
				break;
			}

		}
	}
	@Test
	public void ti(){
		String []dateArray = {"2013-04-01","2013-04-08","2013-04-28",
				"2013-04-08", "2013-11-11"};
		showResult(dateArray);
	}

	private static void showResult(String[] dateArray) {
		Map<String, Integer> dateMap = new TreeMap<String, Integer>();
		int i, arrayLen;
		arrayLen = dateArray.length;
		for(i = 0; i < arrayLen; i++){
			String dateKey = dateArray[i];
			if(dateMap.containsKey(dateKey)){
				int value = dateMap.get(dateKey) + 1;
				dateMap.put(dateKey, value);
			}else{
				dateMap.put(dateKey, 1);
			}
		}
		Set<String> keySet = dateMap.keySet();
		String []sorttedArray = new String[keySet.size()];
		Iterator<String> iter = keySet.iterator();
		int index = 0;
		while (iter.hasNext()) {
			String key = iter.next();
			//    System.out.println(key + ":" + dateMap.get(key));
			sorttedArray[index++] = key;
		}
		int sorttedArrayLen = sorttedArray.length;
		System.out.println("最小日期是：" + sorttedArray[0] + "," +
				" 天数为" + dateMap.get(sorttedArray[0]));
		System.out.println("最大日期是：" + sorttedArray[sorttedArrayLen - 1] + "," +
				" 天数为" + dateMap.get(sorttedArray[sorttedArrayLen - 1]));
	}
	//线程测试
	@Test
	public  void thread(){
		int ticket = 13;

		AtomicInteger tickets=new AtomicInteger(13);
		MyThread thread = new MyThread(ticket);

		List<Thread> threads = new ArrayList<>();
		for(int i=0;i<5;i++){
			threads.add(new Thread(thread));
		}
		for (Thread thread1: threads){
			thread1.start();
		}
	}

	@Test
	public void hutool(){
		String md5 = SecureUtil.md5("123456");
		System.out.println(md5);
		HMac hmacMd5 = SecureUtil.hmacMd5(md5);
		System.out.println(hmacMd5.toString());
	}

}
