//
// Test Enum
//

public class TestEnum {
    
    public enum MyEnum
    {
        INVITER_ID("userId"),
        INVITER_ORG_ID("orgId");
     
        private final String myEum;
    
        MyEnum (final String myEum) {
            this.myEum = myEum;
        }
    
        @Override
        public String toString() {
            return this.myEum;
        }
    }
}
