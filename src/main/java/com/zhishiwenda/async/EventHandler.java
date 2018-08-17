package com.zhishiwenda.async;

import java.util.List;

/**
 * Created by zhishiwenda on 2018/7/30.
 */
public interface EventHandler {
    void doHandle(EventModel model);

    List<EventType> getSupportEventTypes();
}
