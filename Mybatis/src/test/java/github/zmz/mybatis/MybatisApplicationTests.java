package github.zmz.mybatis;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import github.zmz.mybatis.entity.WindowFunTest;
import github.zmz.mybatis.service.WindowFunTestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    private WindowFunTestService windowFunTestService;


    @Test
    public void getAllTest() {
        List<WindowFunTest> windowFunTestAll = windowFunTestService.getAll();
    }

    @Test
    public void getPageTest() {
        PageInfo<WindowFunTest> page = windowFunTestService.getPage(new Page(1, 5));
    }

}
