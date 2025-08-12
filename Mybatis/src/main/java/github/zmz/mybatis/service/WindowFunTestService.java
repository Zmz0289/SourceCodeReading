package github.zmz.mybatis.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import github.zmz.mybatis.entity.WindowFunTest;

import javax.swing.*;
import java.util.List;

public interface WindowFunTestService {

    List<WindowFunTest> getAll();

    PageInfo<WindowFunTest> getPage(Page page);

}
