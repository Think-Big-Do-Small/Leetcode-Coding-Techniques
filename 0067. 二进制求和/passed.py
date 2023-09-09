"""
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
"""


class Solution:   
    def addBinary(self, a, b):
        carry = 0
        result = ""
        i = len(a) - 1
        j = len(b) - 1

        while i >= 0 or j >= 0 or carry > 0:
            digit_a = int(a[i]) if i >= 0 else 0
            digit_b = int(b[j]) if j >= 0 else 0

            # 计算当前位的和
            current_sum = digit_a + digit_b + carry

            # 根据当前和的值更新结果和进位
            if current_sum == 0 or current_sum == 1:
                result = str(current_sum) + result
                carry = 0
            elif current_sum == 2:
                result = "0" + result
                carry = 1
            elif current_sum == 3:
                result = "1" + result
                carry = 1

            i -= 1
            j -= 1

        return result