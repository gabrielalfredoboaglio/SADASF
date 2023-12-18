package service.impl;

import entity.Segment;
import org.springframework.stereotype.Service;
import service.SegmentService;

import java.util.List;

@Service
public class SegmentServiceImpl implements SegmentService {
    @Override
    public List<Segment> getAllSegments() {
        return null;
    }

    @Override
    public Segment getSegmentById(Long segmentId) {
        return null;
    }

    @Override
    public void saveSegment(Segment segment) {

    }

    @Override
    public void updateSegment(Long segmentId, Segment updatedSegment) {

    }

    @Override
    public void deleteSegment(Long segmentId) {

    }
}
