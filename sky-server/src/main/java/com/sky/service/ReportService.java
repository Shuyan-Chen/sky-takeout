package com.sky.service;

import com.sky.vo.OrderReportVO;
import com.sky.vo.SalesTop10ReportVO;
import com.sky.vo.TurnoverReportVO;
import com.sky.vo.UserReportVO;

import java.time.LocalDate;

public interface ReportService {

    TurnoverReportVO getTurnoverStat(LocalDate begin, LocalDate end);

    UserReportVO getUserStat(LocalDate begin, LocalDate end);

    OrderReportVO getOrderStat(LocalDate begin, LocalDate end);

    SalesTop10ReportVO getTop10Stat(LocalDate begin, LocalDate end);
}
