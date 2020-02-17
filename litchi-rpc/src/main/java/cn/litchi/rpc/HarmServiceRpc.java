package cn.litchi.rpc;

import cn.litchi.model.model.LzHarm;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "litchi-data-server")
@RequestMapping("/harm")
public interface HarmServiceRpc {
	@GetMapping("/list")
	List<LzHarm> getHarmList(@RequestParam("type") String type);
	@GetMapping("")
	LzHarm getHarmById(@RequestParam("id") Long id);
	@PostMapping(value = "",consumes = MediaType.APPLICATION_JSON_VALUE)
	Boolean addHarm(@RequestBody LzHarm harm);
}
