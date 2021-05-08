package com.example.demo.Implement;

import com.example.demo.Dao.HuiyiMapper;
import com.example.demo.Entity.Huiyi;
import com.example.demo.Entity.HuiyiExample;
import com.example.demo.Entity.HuiyiGroup;
import com.example.demo.OtherEntity.HuiyiEvent;
import com.example.demo.OtherEntity.HuiyiEventContent;
import com.example.demo.Service.IHuiyiService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HuiyiService implements IHuiyiService {
    // 需要在pringboot中配置
    @Autowired
    private HuiyiMapper mapper;

    @Override
    public String PullHuiyiData() {
        HuiyiExample example = new HuiyiExample();
        HuiyiExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("month");
        criteria.andYearEqualTo(2021);
        List<HuiyiGroup> list = mapper.getgroups();
        List<HuiyiEvent> events=new ArrayList<HuiyiEvent>();
        if (list != null && list.size() > 0) {
            for (HuiyiGroup huiyigroup : list) {
                HuiyiEvent huiyiEvent = new HuiyiEvent();
                huiyiEvent.setEvent(new ArrayList<>());
                huiyiEvent.setMonth(huiyigroup.getMonth());
                for (Huiyi huiyi : huiyigroup.getHuiyis()) {
                    HuiyiEventContent huiyiEventContent = new HuiyiEventContent();
                    huiyiEventContent.setId(huiyi.getMonthDay());
                    huiyiEventContent.setValue(huiyi.getContet());
                    huiyiEvent.getEvent().add(huiyiEventContent);
                }
                events.add(huiyiEvent);
            }
        }
        String json = JSONArray.fromObject(events).toString();
        return json;
    }
}
