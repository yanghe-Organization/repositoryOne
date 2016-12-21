package app.config;

import java.io.IOException;
import java.nio.charset.Charset;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import app.entity.DemoObj;

public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj>{
	/**
	 * 新建自定义媒体类型
	 */
	public MyMessageConverter() {
		// TODO Auto-generated constructor stub
		super(new MediaType("application", "x-wisely", Charset.forName("utf-8")));
	}
	/**
	 * 表明本Converter只处理DemoObj这个类
	 */
	@Override
	protected boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		
		return DemoObj.class.isAssignableFrom(clazz);
	}
	/**
	 * 处理请求数据
	 */
	@Override
	protected DemoObj readInternal(Class<? extends DemoObj> clazz,
			HttpInputMessage inputMessage) throws IOException,
			HttpMessageNotReadableException {
		// TODO Auto-generated method stub
		String temp=StreamUtils.copyToString(inputMessage.getBody(), Charset.forName("utf-8"));
		System.out.println("------------temp:"+temp+"-------------");
		String[] tempArr=temp.split("-");
		
		return new DemoObj(new Long(tempArr[0]), tempArr[1]);
	}
	/**
	 * 处理如何输出数据到response
	 */
	@Override
	protected void writeInternal(DemoObj t, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		// TODO Auto-generated method stub
		String out="hello:"+t.getId()+"-"+t.getName();
		outputMessage.getBody().write(out.getBytes());
	}

}
