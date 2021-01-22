package top.colayy.services;

import top.colayy.pojo.Classify;

import java.util.List;

public interface ClassifyService {
    // 试题分类 -- 添加
    boolean addClassify(Classify classify);
    // 试题分类 -- 删除
    boolean delClassify(Classify classify);
    // 试题分类 -- 修改名称
    boolean changeClassify(Classify classify);
    // 试题分类 -- 显示所有
    List<Classify> queryAllClassify(String uId);
}
