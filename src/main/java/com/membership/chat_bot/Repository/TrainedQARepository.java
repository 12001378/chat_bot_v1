package com.membership.chat_bot.Repository;

import com.membership.chat_bot.entity.TrainedQA;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrainedQARepository extends JpaRepository<TrainedQA, UUID> {

}
