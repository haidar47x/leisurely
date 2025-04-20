import { heroui } from '@heroui/react';
import { join } from 'path';

/** @type {import('tailwindcss').Config} */
export const content = [
  './node_modules/@heroui/theme/dist/**/*.{js,ts,jsx,tsx,mjs}',
  join(require.resolve('@heroui/react'), '../**/*.{js,ts,jsx,tsx}'),
  './src/**/*.{html,js,ts,jsx,tsx,mjs}',
];

export const theme = {
  extend: {
    colors: {
      white: '#FFFFFF',
      black: '#000000',
      blue: {
        50: '#e6f1fe',
        100: '#cce3fd',
        200: '#99c7fb',
        300: '#66aaf9',
        400: '#338ef7',
        500: '#006FEE',
        600: '#005bc4',
        700: '#004493',
        800: '#002e62',
        900: '#001731'
      }
    }
  }
};

export const darkMode = 'class';
export const plugins = [
  heroui({
    addCommonColors: true
  })
];
