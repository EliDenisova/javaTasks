package GeoWithResearch;
public enum Relationship {
    parent {
        public Relationship getOppositeRelationship() {
            return children;
        }
    },
    children {
        public Relationship getOppositeRelationship() {
            return parent;
        }
    },
    Grandparent {
        public Relationship getOppositeRelationship() {
            return Grandchild;
        }
    },
    Grandchild {
        public Relationship getOppositeRelationship() {
            return Grandparent;
        }
    },
    Aunt_Uncle {
        public Relationship getOppositeRelationship() {
            return NEPHEW_NIECE;
        }
    },
    NEPHEW_NIECE {
        public Relationship getOppositeRelationship() {
            return Aunt_Uncle;
        }
    },
    Cousin {
        public Relationship getOppositeRelationship() {
            return Cousin;
        }
    };



    public abstract Relationship getOppositeRelationship();
}
