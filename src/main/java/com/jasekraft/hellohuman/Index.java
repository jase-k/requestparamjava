package com.jasekraft.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {

		@RequestMapping("/")
		public String index(@RequestParam(name="fn", required=false) String fn, @RequestParam(name = "ln", required=false) String ln) {
			if(fn == null && ln == null) {
				return "Hello Human";
			}
			else if(ln == null){
				return "Hello "+fn;				
			}
			else if(fn == null) {
				return "Hello Mr. "+ ln;
			}
			else {
				return String.format("Hello %s %s", fn, ln);
			}
		}
}
