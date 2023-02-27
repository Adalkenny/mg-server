package cv.mentex.mgserver.service;

import cv.mentex.mgserver.dto.FeatureDTO;
import cv.mentex.mgserver.repository.FeatureRepo;
import cv.mentex.mgserver.util.RespostaUtil;
import org.springframework.jdbc.core.JdbcTemplate;

public class FeatureService implements FeatureRepo {

    private JdbcTemplate db;

    public FeatureService(JdbcTemplate db){
        this.db = db;
    }

    @Override
    public RespostaUtil create(String username, FeatureDTO feature) {
        return null;
    }

    @Override
    public RespostaUtil update(String username, FeatureDTO feature) {
        return null;
    }

    @Override
    public RespostaUtil feature(String username, long featureID) {
        return null;
    }

    @Override
    public RespostaUtil features(String username) {
        return null;
    }

    @Override
    public RespostaUtil delete(String username, long featureID) {
        return null;
    }
}
