package github.zmz.mybatis.mapper;

import com.github.pagehelper.Page;
import github.zmz.mybatis.entity.WindowFunTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

public interface WindowFunTestMapper {

    List<WindowFunTest> selectAll();

}
