package service.impl;

import entity.LegalEntity;
import org.springframework.stereotype.Service;
import service.LegalEntityService;

import java.util.List;

@Service
public class LegalEntityServiceImpl implements LegalEntityService {
    @Override
    public List<LegalEntity> getAllLegalEntities() {
        return null;
    }

    @Override
    public LegalEntity getLegalEntityById(Long legalEntityId) {
        return null;
    }

    @Override
    public void saveLegalEntity(LegalEntity legalEntity) {

    }

    @Override
    public void updateLegalEntity(Long legalEntityId, LegalEntity updatedLegalEntity) {

    }

    @Override
    public void deleteLegalEntity(Long legalEntityId) {

    }
}
