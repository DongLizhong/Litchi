package cn.litchi.rpc;

import cn.litchi.model.model.LzLitchiType;
import cn.litchi.model.model.LzOrcpicture;
import cn.litchi.model.model.LzText;
import cn.litchi.model.model.TbContent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@FeignClient(value = "litchi-source-server")
@RequestMapping("/source")
public interface SourceServiceRpc {

	@GetMapping("/carousepic")
	List<TbContent> getCarouselPic();

	@PostMapping(value = "/upload",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	Map<String,String> uploadFile(@RequestPart("file") MultipartFile uploadFile);

	@GetMapping("/orcpic")
	List<LzOrcpicture> getOrcPic(@RequestParam("orcId") Long orcId);

	@GetMapping("/litchitype")
	LzLitchiType getLitchiType(@RequestParam("typeId") Long typeId);

	@GetMapping("/litchitext")
	List<LzText> getLitchiTextByTypeId(@RequestParam("typeId") Long typeId);
}
