package cn.litchi.rpc;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "litchi-monitor-server")
@RequestMapping("/monitor")
public interface MonitorServiceRpc {
}
