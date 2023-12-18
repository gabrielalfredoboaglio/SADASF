package service;

import entity.LegalEntity;

import java.util.List;

public interface LegalEntityService {
    List<LegalEntity> getAllLegalEntities();
    LegalEntity getLegalEntityById(Long legalEntityId);
    void saveLegalEntity(LegalEntity legalEntity);
    void updateLegalEntity(Long legalEntityId, LegalEntity updatedLegalEntity);
    void deleteLegalEntity(Long legalEntityId);
}
