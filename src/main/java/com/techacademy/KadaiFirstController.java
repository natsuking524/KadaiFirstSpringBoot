package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; // 追加
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "計算結果：" + res;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "計算結果：" + res;
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "計算結果：" + res;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return "計算結果：" + res;
    }

    @GetMapping("/dayofweek/{val1}")
    public String dispDayOfWeek(@PathVariable String val1) {
        // val1を3つの変数に分ける。substring
        String str = "20191231";
        String year = val1.substring(0, 4);
        String mon = val1.substring(4, 6);
        String day = val1.substring(6, 8);
        System.out.println(val1);
        System.out.println(123 + "456");
        LocalDate targetDate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(mon), Integer.parseInt(day));

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
//        LocalDate testDate = LocalDate.parse(val1, formatter);

        DayOfWeek w = targetDate.getDayOfWeek();
//        DayOfWeek testw = testDate.getDayOfWeek();
        System.out.println(targetDate); // yyyy mm dd
        System.out.println(w); // 曜日
        return "計算結果：" + w;

    }

//        //StringからInt
//        final var date = LocalDate.of(2019, 12, 31);
//        final var formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
//        System.out.println(date.format(formatter)); // 2019年12月31日火曜日
//
//
//        final var week = date.getDayOfWeek();
//        System.out.println(week); // WEDNESDAY

}
