package com.alibaba.apiopenplatform.dto.params.chat;

import com.alibaba.apiopenplatform.support.chat.ChatMessage;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author zh
 */
@Data
@Builder
public class ChatRequestBody {

    private String model;

    private Boolean stream;
    
    @JsonProperty("max_tokens")
    private Integer maxTokens;
    
    @JsonProperty("top_p")
    private Double topP;

    private Double temperature;
    
    @JsonProperty("web_search_options")
    private WebSearchOptions webSearchOptions;

    private List<ChatMessage> messages;
}