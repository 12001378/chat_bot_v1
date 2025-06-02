package com.membership.chat_bot.Mapper;

import com.membership.chat_bot.entity.TrainedQA;
import com.membership.chat_bot.payload.TraningDTO;

public class TrainedQAMapper {

    public static TraningDTO mapToDTO(TrainedQA trainedQA) {
        TraningDTO dto = new TraningDTO();
            dto.setQuestion(trainedQA.getT_question());
            dto.setAnswer(trainedQA.getT_answer());
            return dto;
    }
}
