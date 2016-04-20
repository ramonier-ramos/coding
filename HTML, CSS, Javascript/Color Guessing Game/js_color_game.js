var target_index;
var target;
var guess_input;
var finished = false;
var guesses = 0;
var colors = ["orange", "magenta", "white", "gold", "yellow", "cyan", "red", "blue", "green"];
var colors_sorted = colors.sort();

function do_game(){
    /*var random_number = Math.random() * 7;
    var random_number_int = Math.floor(random_number);
    target_index = random_number_int;
    var target = */
    target = colors_sorted[Math.floor(Math.random() * colors_sorted.length)];
    alert(target);

    while (!finished){
      guess_input = prompt("I am thinking of one of these colors: " +
                                "\n\nblue, cyan, gold, green, magenta, orange, red, white," +
                                "\nyellow\n\n"+
                                "What color am I thinking of? ");
      guesses+= 1;
      finished = check_guess();
    }
}
function check_guess(){
    if (colors_sorted.indexOf(guess_input) == -1){
      alert("I don't recognize the color you entered!\n\n" +
            "Please enter blue, cyan, gold, green, magenta, orange, red, white, or yellow.");
      return false;
    }
    if (guess_input > target){
      alert("Hint: your color is alphabetically higher than mine!" +
            "\nPlease try again. ");
      return false;
    }
    if (guess_input < target){
      alert("Hint: your color is alphabetically lower than mine!" +
            "\nPlease try again. ");
      return false;
    }
    if (guess_input == target && guesses == 1){
    alert("Congratulations! You guessed the color I was thinking!" +
          ".\n\nIt took you " + guesses +
          " guess to guess the color!");
          return true;
          target_index = guess_input;
          myBody.style.background = target_index;
        }
        alert("Congratulations! You guessed the color I was thinking!" +
              ".\n\nIt took you " + guesses +
              " guesses to guess the color!");
              return true;
              target_index = guess_input;
              myBody.style.background = target_index;
}
