package cn.litchi.rpc;

import cn.litchi.model.model.DBTbItem;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "litchi-product-server")
@RequestMapping("/product")
public interface ProductServiceRpc {
    @GetMapping("/list")
    List<DBTbItem> getItemList(@RequestParam("offset") Integer offset,
                               @RequestParam("limit") Integer limit);

    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    Boolean addItem(@RequestBody DBTbItem item, @RequestParam("desc") String desc);

    @GetMapping(value = "/delete")
    Boolean deleteItem(@RequestParam("itemId") Long itemId);

    @GetMapping(value = "/get")
    DBTbItem getItem(@RequestParam("itemId") Long itemId);

    @PostMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    Boolean updateItem(@RequestBody DBTbItem item);
}
