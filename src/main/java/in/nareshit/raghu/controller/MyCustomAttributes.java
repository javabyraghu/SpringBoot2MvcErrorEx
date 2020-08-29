package in.nareshit.raghu.controller;

import java.util.Map;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

@Component
public class MyCustomAttributes extends DefaultErrorAttributes {

	@Override
	public Map<String, Object> getErrorAttributes(WebRequest request, ErrorAttributeOptions options) {
		Map<String,Object> map = super.getErrorAttributes(request, options);
		map.put("title", "NIT");
		return map;
	}
}
