package com.fastcampus.loan.service;

import com.fastcampus.loan.dto.CounselDTO;
import com.fastcampus.loan.dto.CounselDTO.*;

public interface CounselService {
  Response create(CounselDTO.Request request);

  Response get(Long counselId);

  Response update(Long counselId, Request request);

}
