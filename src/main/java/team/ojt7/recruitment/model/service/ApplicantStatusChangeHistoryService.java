package team.ojt7.recruitment.model.service;

import java.util.List;

import team.ojt7.recruitment.model.dto.ApplicantStatusChangeHistoryDto;

public interface ApplicantStatusChangeHistoryService {

	public ApplicantStatusChangeHistoryDto save(ApplicantStatusChangeHistoryDto dto);
	
	public List<ApplicantStatusChangeHistoryDto> findAllByApplicantId(Long applicantId);

	ApplicantStatusChangeHistoryDto getCurrentStatus(Long applicantId);
}
