package nz.co.aetheric.poopermacho.comparison;

import nz.co.aetheric.poopermacho.BaseEntity;
import nz.co.aetheric.poopermacho.auth.PooperMacho;
import nz.co.aetheric.poopermacho.movement.Movement;

import java.util.Date;

public class Comparison extends BaseEntity<Comparison> {

    private Movement left;
    private Movement right;
    private ComparisonType comparisonType;
    private PooperMacho comparator;

    public Comparison() {
        super(Comparison.class);
    }

    public Movement getLeft() {
        return left;
    }

    public Comparison setLeft(Movement left) {
        this.left = left;
        return this;
    }

    public Movement getRight() {
        return right;
    }

    public Comparison setRight(Movement right) {
        this.right = right;
        return this;
    }

    public ComparisonType getComparisonType() {
        return comparisonType;
    }

    public Comparison setComparisonType(ComparisonType comparisonType) {
        this.comparisonType = comparisonType;
        return this;
    }

    public PooperMacho getComparator() {
        return comparator;
    }

    public Comparison setComparator(PooperMacho comparator) {
        this.comparator = comparator;
        return this;
    }
}
