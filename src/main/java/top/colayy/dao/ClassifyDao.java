package top.colayy.dao;

import top.colayy.pojo.Classify;

import java.util.List;

public interface ClassifyDao {
    // 试题分类 -- 添加
    int addClassify(Classify classify);

    // 试题分类 -- 删除
    int delClassify(Classify classify);

    // 试题分类 -- 修改名称
    int changeClassify(Classify classify);

    // 试题分类 -- 显示所有
    List<Classify> showClassify(String uId);

    // 试题分类 - 通过分类ID查询
    Classify showClassifyById(String cId);

    // 试题分类 - 显示所有，不分页
    List<Classify> showClassifyList(String uId);
}
