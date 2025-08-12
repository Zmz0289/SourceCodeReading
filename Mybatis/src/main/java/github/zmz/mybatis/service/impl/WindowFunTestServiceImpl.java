package github.zmz.mybatis.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import github.zmz.mybatis.entity.WindowFunTest;
import github.zmz.mybatis.mapper.WindowFunTestMapper;
import github.zmz.mybatis.service.WindowFunTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WindowFunTestServiceImpl implements WindowFunTestService {

    @Autowired
    private WindowFunTestMapper windowFunTestMapper;

    @Override
    public List<WindowFunTest> getAll() {
        return windowFunTestMapper.selectAll();
    }

    @Override
    public PageInfo<WindowFunTest> getPage(Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        return new PageInfo<>(windowFunTestMapper.selectAll());
    }
}
