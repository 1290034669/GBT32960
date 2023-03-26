package com.yzxc.common.util;

import com.yzxc.common.formatters.PlatformMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMessage {
    private String vin;
    private PlatformMessage message;
}
