package task1

class ArrayUtilsTest extends GroovyTestCase {

    def arrayUtils = new ArrayUtils()

    void testGetMaxValueFromArr() {
        setup:
        long[][] arr = [[1L, 2L], [-100L, 55L]]
        when:
        def result = arrayUtils.getMaxValueFromArr(arr)
        then:
        result == arr[1][1]
    }

    void testGetMinValueFromArr() {
        setup:
        long[][] arr = [[1L, 2L], [-100L, 55L]]
        when:
        def result = arrayUtils.getMinValueFromArr(arr)
        then:
        result == arr[1][0]
    }

    void testGetMidValueFromArr() {
        setup:
        long[][] arr = [[1L, 2L], [3L, 2L]]
        when:
        def result = arrayUtils.getMidValueFromArr(arr)
        then:
        result == 2
    }
}
