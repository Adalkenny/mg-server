package cv.mentex.mgserver.repository;

import cv.mentex.mgserver.dto.FeatureDTO;
import cv.mentex.mgserver.util.RespostaUtil;

public interface FeatureRepo {
    RespostaUtil create(String username,FeatureDTO feature);
    RespostaUtil update(String username,FeatureDTO feature);
    RespostaUtil feature(String username,long featureID);
    RespostaUtil features(String username);
    RespostaUtil delete(String username,long featureID);
}
