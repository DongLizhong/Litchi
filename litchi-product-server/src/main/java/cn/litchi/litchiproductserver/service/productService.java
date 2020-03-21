package cn.litchi.litchiproductserver.service;

import cn.litchi.model.mapper.TbItemDao;
import cn.litchi.model.mapper.TbItemDescDao;
import cn.litchi.model.model.DBTbItem;
import cn.litchi.model.model.DBTbItemDesc;
import cn.litchi.rpc.ProductServiceRpc;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.List;

@RestController
public class productService implements ProductServiceRpc {

    @Autowired
    private TbItemDao itemDao;

    @Autowired
    private TbItemDescDao itemDescDao;

    @Override
    public List<DBTbItem> getItemList(Integer offset, Integer limit) {
        return itemDao.selectPage(new Page<>(offset, limit), null).getRecords();
    }

    @Override
    public Boolean addItem(DBTbItem item, String desc) {
        item.setCreateTime(Instant.now());
        item.setUpdateTime(Instant.now());
        itemDao.insert(item);
        DBTbItemDesc tbItemDesc = DBTbItemDesc.builder()
                .itemId(item.getId())
                .itemDesc(desc)
                .createTime(Instant.now())
                .updateTime(Instant.now())
                .build();
        itemDescDao.insert(tbItemDesc);
        return true;
    }

    @Override
    public Boolean deleteItem(Long itemId) {
        itemDao.deleteById(itemId);
        itemDescDao.delete(new QueryWrapper<DBTbItemDesc>().lambda().eq(DBTbItemDesc::getItemId, itemId));
        return true;
    }

    @Override
    public DBTbItem getItem(Long itemId) {
        DBTbItem item = itemDao.selectById(itemId);
        item.setDesc(itemDescDao.selectById(itemId));
        return item;
    }

    @Override
    public Boolean updateItem(DBTbItem item) {
        itemDao.updateById(item);
        return true;
    }
}
