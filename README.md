# Language Character Identifier

A Java-based core logic utility designed to identify the linguistic script or writing system of a given character by analyzing its Unicode hex range.

## Overview
Instead of relying on heavy external NLP libraries for simple character detection, this utility uses direct Unicode block parsing. It processes a character's memory representation and accurately maps it to its corresponding alphabet or script. 

This repository contains the backend "brain" of the identifier, stripped of any front-end/GUI dependencies to demonstrate clean, logic-driven Java development.

## Supported Scripts
* Latin (Basic & Supplement)
* Cyrillic
* Greek
* Arabic
* Hebrew
* Devanagari (Hindi)
* CJK Unified Ideographs (Chinese/Kanji)
* Japanese (Hiragana/Katakana)
* Hangul (Korean)

## Tech Stack
* **Language:** Java
* **Core Concepts:** Unicode Hex Ranges, Memory Representation, Clean Backend Logic
