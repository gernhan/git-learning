# Vim

## Modes

### `Normal` Mode (default)

#### Navigation

- Use `h`, `j`, `k`, `l` for left, down, up, and right movement.
- `<C-u>`: page-up, `<C-d>`: page-down
- `w`: to the next word, `e`: to the end of the next word, `b`: back to the previous word

* `<C-o>`: move back. It will be `mb` in the `nvim`.
* `<C-i>`: move forward. It will be `mf` in the `nvim`.

Search in lines:

- Press `f` then a single character to head to the right to the first occurrence of the character

  - Press `;` to search the next character, `,` to search the previous character

- Press `F` to execute the same functionalities as `f` but in an opposite direction

#### Switch modes

- From almost every case, to switch back to `Normal` mode, just press `<Esc>`

1. To switch to `Visual` mode, press `v`
2. To switch to `Insert` mode, press `i`
3. To switch to `Command` mode,
   - Press `/` to search down, `?` to search up then type the text then press `<Enter>`
   - Press `:` to use vim commands or `:!` to use terminal commands

### `Insert` Mode

- Assuming we are in the `Normal` mode, then press `i` to enter `Insert` Mode (for inserting text).
- Press `Esc` to switch back to `Normal` Mode.

* In this mode, you can type and edit text as you would in any other text editor.

### `Visual` Mode

- Press `v` in `Normal` Mode to enter `Visual` Mode.
- You can then navigate and select text using movement keys.
- Useful for copying/pasting, deleting, or applying operations to a selected block of text.

### `Command` Mode (Ex Mode):

- Press `:` in `Normal` Mode to enter `Command` Mode.
- `Command` Mode, often referred to as Ex Mode, allows you to perform more advanced operations and execute commands.

* Examples:
  - `:w` to save changes.
  - `:q` to quit.
  - `:wq` to save and quit.
  - `:q!` to quit without saving.

- `:ABCD` to execute `ABCD` command, which is a vim command.
  - For examples, `:Mason` to open Mason dialog
- `:!XYZT` to execute `ABCD` command, which is a vim command.
  - For examples, `:!ls` to execute `ls` command in this internal terminal inside vim

## Basic Commands

1. **Saving and Quitting:**

   - `:w` to save changes.
   - `:q` to quit.
   - `:wq` to save and quit.
   - `:q!` to quit without saving.

2. **Undo and Redo:**

   - `u` to undo.
   - `Ctrl + r` to redo.

3. **Search and Replace:**

   - To start searching
     - `/` to start searching down.
     - `?` to start searching down.
   - `n` to find the next occurrence.
   - `N` to find the previous occurrence.
   - `:%s/old/new/g` to replace all occurrences of 'old' with 'new'.

4. **Change visualized text:**

   - Use `Visual` mode to visualize a text fragment.

     - For examples, press `b` to put the cursor on the first character of the last word, `v` and `e` to visualize a word.

   - Press `c` to change the visualized text, you are in the `Insert` mode now.
   - In case that you just want to delete the visualized text, just press `x`

   * `ciw`: change this word. Similarly, we can use `diw` to delete this word.

5. **Copy, Cut, and Paste:**

   - `yy` to yank (copy) a line.
   - `dd` to delete (cut) a line.
   - `p` to paste the contents after the cursor.

6. **Navigating Files:**

   - `:e filename` to open a file.
   - `:bnext` to go to the next buffer.
   - `:bprev` to go to the previous buffer.

7. **Moving Around:**

   - `gg` to go to the beginning of the file.
   - `G` to go to the end of the file.
   - `:line_number` to jump to a specific line.

8. **Window Management:**

   - `:vsp` to split the window vertically.
   - `:sp` to split the window horizontally.
   - `Ctrl + w` followed by `h`, `j`, `k`, or `l` to navigate between windows.

## Advanced Tips

1. **Registers:**

   - `"ay` to yank text into register 'a'.
   - `"ap` to paste from register 'a'.

2. **Marks:**

   - `ma` to set a mark named 'a'.
   - `` `a`` to jump back to mark 'a'.

3. **Macros:**
   - `qa` to start recording a macro into register 'a'.
   - `q` to stop recording.
   - `@a` to execute the macro in register 'a'.
