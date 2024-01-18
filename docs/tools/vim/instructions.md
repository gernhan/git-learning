# Vim

## Modes

1. **Normal Mode (default):**

   - Use `h`, `j`, `k`, `l` for left, down, up, and right movement.
   - `i` to enter Insert Mode (for inserting text).
   - `x` to delete the character under the cursor.
   - `dd` to delete the current line.

2. **Insert Mode:**

   - Press `Esc` to switch back to Normal Mode.
   - In this mode, you can type and edit text as you would in any other text editor.

3. **Visual Mode:**
   - Press `v` in Normal Mode to enter Visual Mode.
   - You can then navigate and select text using movement keys.
   - Useful for copying/pasting, deleting, or applying operations to a selected block of text.

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

   - `/` to start searching.
   - `n` to find the next occurrence.
   - `N` to find the previous occurrence.
   - `:%s/old/new/g` to replace all occurrences of 'old' with 'new'.

4. **Copy, Cut, and Paste:**

   - `yy` to yank (copy) a line.
   - `dd` to delete (cut) a line.
   - `p` to paste the contents after the cursor.

5. **Navigating Files:**

   - `:e filename` to open a file.
   - `:bnext` to go to the next buffer.
   - `:bprev` to go to the previous buffer.

6. **Moving Around:**

   - `gg` to go to the beginning of the file.
   - `G` to go to the end of the file.
   - `:line_number` to jump to a specific line.

7. **Window Management:**
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
