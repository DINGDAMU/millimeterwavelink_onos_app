package org.onosproject.millimeterwave_app;

import org.onosproject.net.link.LinkListener;

/**
 * Created by dingdamu on 17/1/17.
 */
public interface NetcfgController{
    void addListener(LinkListener listener);
    void removeListener(LinkListener listener);

}
