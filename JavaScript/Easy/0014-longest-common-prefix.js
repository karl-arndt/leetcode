/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    let res = strs[0];
    for (let i = 0; i < strs.length; i++) {
        let temp = "";
        let j = 0;
        while (j < strs[i].length && j < res.length && res.charAt(j) == strs[i].charAt(j) ) {
            temp += strs[i].charAt(j);
            j++;
        }
        res = temp;
    }
    return res;
};