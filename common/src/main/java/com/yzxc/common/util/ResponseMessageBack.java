package com.yzxc.common.util;

import com.yzxc.common.paltform.PlatformMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMessageBack {
    private String vin;
    private PlatformMessage message;
}
