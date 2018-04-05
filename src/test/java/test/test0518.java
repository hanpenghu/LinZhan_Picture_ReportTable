package test;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//containsKey
//当且仅当此映射包含针对满足 (key==null ? k==null : key.equals(k)) 的键 k 的映射关系时，返回 true
public class test0518 {
    public static void main(String[] args) {
        List<JavaBean> list = new ArrayList<JavaBean>();
        list.add(new JavaBean("来源A", 100));
        list.add(new JavaBean("来源B", 200));
        list.add(new JavaBean("来源C", 300));
        list.add(new JavaBean("来源B", 6600));
        list.add(new JavaBean("来源A", 99800));
        List<JavaBean> groupList = getListByGroup(list);
        for (JavaBean bean : groupList) {
            System.out.print(bean.getGroup() + "        ");
            System.out.println(bean.getMoney());
        }
    }

    private static List<JavaBean> getListByGroup(List<JavaBean> list) {

        // 如果需要sum多个字段，可以定义 key value(object) Map<String, object> hashmap
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (JavaBean bean : list) {
            // 如果需要group by 多个字段，对应key=字段a+字段b...
            String key = bean.getGroup();
            if (map.containsKey(key)) {
                map.put(bean.getGroup(), map.get(key) + bean.getMoney());
            } else {
                map.put(bean.getGroup(), bean.getMoney());
            }
        }

        // 放入list
        List<JavaBean> result = new ArrayList<JavaBean>();
        for (Entry<String, Integer> entry : map.entrySet()) {
            result.add(new JavaBean(entry.getKey(), entry.getValue()));
        }
        return result;
    }
}

class JavaBean {
    private String group;
    private int money;

    public JavaBean() {
    }

    public JavaBean(String group, int money) {
        this.group = group;
        this.money = money;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}