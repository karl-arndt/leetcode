/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if (x < 0) {
        return false;
    }
    let y = x % 10;
    let temp = Math.floor(x / 10);
    while (temp > 0) {
        y *= 10;
        y += temp % 10;
        temp = Math.floor(temp / 10);
    }
    return x == y;
};