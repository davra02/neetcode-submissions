class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if(len(s) != len(t)):
            return False;

        chars1 = dict();
        chars2 = dict();
        n = len(s)

        for i in range(n):
            if s[i] in chars1.keys():
                chars1[s[i]] += 1;
            else:
                chars1[s[i]] = 1;
            if t[i] in chars2.keys():
                chars2[t[i]] += 1;
            else:
                chars2[t[i]] = 1;

        return chars1 == chars2;