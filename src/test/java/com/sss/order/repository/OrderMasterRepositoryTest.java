package com.sss.order.repository;

import com.sss.order.OrderApplicationTests;
import com.sss.order.dataobject.OrderMaster;
import com.sss.order.enums.OrderStatusEnum;
import com.sss.order.enums.PayStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author shishusheng
 * @date 2018/6/11 02:09
 */
@Component
public class OrderMasterRepositoryTest extends OrderApplicationTests {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void testSave() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("Wasabi");
        orderMaster.setBuyerPhone("13236519712");
        orderMaster.setBuyerOpenid("1101110");
        orderMaster.setBuyerAddress("Nanjing");
        orderMaster.setOrderAmount(new BigDecimal(2.5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());

        OrderMaster result = orderMasterRepository.save(orderMaster);
        Assert.assertTrue(result != null);
    }

}

