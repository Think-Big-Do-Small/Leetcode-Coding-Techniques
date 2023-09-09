/**
 * 
67. 二进制求和
简单
1.1K
相关企业
给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。

示例 1：

输入:a = "11", b = "1"
输出："100"
示例 2：

输入：a = "1010", b = "1011"
输出："10101"

 */


class Solution {
    public static String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit_a = i >= 0 ? Character.getNumericValue(a.charAt(i)) : 0;
            int digit_b = j >= 0 ? Character.getNumericValue(b.charAt(j)) : 0;

            // 计算当前位的和
            int current_sum = digit_a + digit_b + carry;

            // 根据当前和的值更新结果和进位
            if (current_sum == 0 || current_sum == 1) {
                result.insert(0, current_sum);
                carry = 0;
            } else if (current_sum == 2) {
                result.insert(0, "0");
                carry = 1;
            } else if (current_sum == 3) {
                result.insert(0, "1");
                carry = 1;
            }

            i--;
            j--;
        }

        return result.toString();
    }
}