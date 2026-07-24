class Solution(object):

    def generateRow(self, row):
        ans = 1
        ansRow = [1]

        for col in range(1, row):
            ans = ans * (row - col)
            ans = ans // col
            ansRow.append(ans)

        return ansRow

    def generate(self, numRows):
        ans = []

        for i in range(1, numRows + 1):
            ans.append(self.generateRow(i))

        return ans